package com.example.ecommercebookstoreproject.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
//id	first_name	last_name	phone	address	flat	division	city	zip	payment	email	paymentmethod	paymentnumber	txid	submit	created_at	updated_at

    @Entity
    public class Orders {
        @Id
        @GeneratedValue(strategy = GenerationType.AUTO)
        private int id;
        private String first_name;
        private String last_name;
        private String phone;
        private String address;
        private String payment;
        private String paymentmethod;
        private String txid;
        private String submit;
        private String date;
        private String status;
        private String division;
        private String city;
        private String zip;
        private double price;

        public Orders() {

        }

        public Orders(int id, String first_name, String last_name, String phone, String address, String payment, String paymentmethod, String txid, String submit, String date, String status, String division, String city, String zip, double price) {
            this.id = id;
            this.first_name = first_name;
            this.last_name = last_name;
            this.phone = phone;
            this.address = address;
            this.payment = payment;
            this.paymentmethod = paymentmethod;
            this.txid = txid;
            this.submit = submit;
            this.date = date;
            this.status = status;
            this.division = division;
            this.city = city;
            this.zip = zip;
            this.price = price;
        }

        @Override
        public String toString() {
            return "Orders{" +
                    "id=" + id +
                    ", first_name='" + first_name + '\'' +
                    ", last_name='" + last_name + '\'' +
                    ", phone='" + phone + '\'' +
                    ", address='" + address + '\'' +
                    ", payment='" + payment + '\'' +
                    ", paymentmethod='" + paymentmethod + '\'' +
                    ", txid='" + txid + '\'' +
                    ", submit='" + submit + '\'' +
                    ", date='" + date + '\'' +
                    ", status='" + status + '\'' +
                    ", price=" + price +
                    '}';
        }

        public String getDivision() {
            return division;
        }

        public void setDivision(String division) {
            this.division = division;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getZip() {
            return zip;
        }

        public void setZip(String zip) {
            this.zip = zip;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getFirst_name() {
            return first_name;
        }

        public void setFirst_name(String first_name) {
            this.first_name = first_name;
        }

        public String getLast_name() {
            return last_name;
        }

        public void setLast_name(String last_name) {
            this.last_name = last_name;
        }

        public String getPhone() {
            return phone;
        }

        public void setPhone(String phone) {
            this.phone = phone;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public String getPayment() {
            return payment;
        }

        public void setPayment(String payment) {
            this.payment = payment;
        }

        public String getPaymentmethod() {
            return paymentmethod;
        }

        public void setPaymentmethod(String paymentmethod) {
            this.paymentmethod = paymentmethod;
        }

        public String getTxid() {
            return txid;
        }

        public void setTxid(String txid) {
            this.txid = txid;
        }

        public String getSubmit() {
            return submit;
        }

        public void setSubmit(String submit) {
            this.submit = submit;
        }

        public String getDate() {
            return date;
        }

        public void setDate(String date) {
            this.date = date;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public double getPrice() {
            return price;
        }

        public void setPrice(double price) {
            this.price = price;
        }
    }

