package com.example.ecommercebookstoreproject.service;

import com.example.ecommercebookstoreproject.dao.Bookdao;
import com.example.ecommercebookstoreproject.model.Book;

import java.util.HashMap;
import java.util.Map;


public class cart {
   // private Bookdao;
  //  public Book books;
    //['id'=>[quantity=.,'price'=>,'data'=>]]
    Map<Integer, Object[]> items;
    public int totalQuantity;
    public double price;

    private  cart(){}

    @Override
    public String toString() {
        return "cart{" +
                "items=" + items +
                ", totalQuantity=" + totalQuantity +
                ", price=" + price +
                '}';
    }

    public cart(cart preCart){
        if (preCart !=null){
            totalQuantity=preCart.totalQuantity;
            price=preCart.price;
            items=preCart.items;
        }else{
            totalQuantity=0;
            price=0;
            items=new HashMap<Integer, Object[]>();
        }
        System.out.println(this);
    }

    private Object[] value(int qty,double price,Book book ){
        Object []data={qty,price,book};
        return  data;
    }



    public Boolean addItem(int id,int qty,Book book ){

        if (items.containsKey(id)){
            Object data[]=items.get(id);
            data[0]=(int)data[0]+qty;
            data[1]=(double)data[1]+book.getPrice()*qty;

        }else {
            Object data[]=value(qty,book.getPrice(),book);
            items.put(id,data);
            totalQuantity+=(int)data[0];
            this.price+=(double) data[1];
        }
        return  true;
    }

    public boolean removeItem(int id ,int qty ){
        if (items.containsKey(id)){
            Object[] ob=items.get(id);
            if ((int)ob[0]<=qty){
                items.remove(id);
                Book book=(Book) ob[2];
                this.price-=(int)ob[0]*book.getPrice();
                this.totalQuantity-=qty;
            }else{
                ob[0]=(int)ob[0]-qty;
                Book book=(Book) ob[2];
                ob[1]=(double)ob[1]-book.getPrice()*(qty);
                this.price-=(int)ob[0]*book.getPrice();
                this.totalQuantity-=qty;
            }

        }else{
            System.out.println("product doesnt exist");
            return false;
        }
        return  true;
    }


}
