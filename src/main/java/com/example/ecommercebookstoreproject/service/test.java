//package com.example.ecommercebookstoreproject.service;
//
//public class test {
//    public String registerProduct(@ModelAttribute("product") Product product, @RequestParam("Photo") MultipartFile file,
//                                  @RequestParam("categoryId") int categoryId, HttpServletRequest request,Model m) throws IOException {
//        HttpSession httpSession = request.getSession();
//        if(file.isEmpty()){
//            System.out.println("File doesn't exist");
//        }else{
//            product.setImageURL(file.getOriginalFilename());
//            String file1 = "G:\\Naoshin\\Project\\Project\\src\\main\\resources\\static\\images";
//            Path path = Paths.get(file1 + File.separator + file.getOriginalFilename());
//            Files.copy(file.getInputStream(), path, StandardCopyOption.REPLACE_EXISTING);
//            Optional<Category> category = categoryRepository.findById(categoryId);
//            product.setCategory(category.get());
//            Product product1 = productRepository.save(product);
//            System.out.println("Image Uploaded");
//            httpSession.setAttribute("msg",product1.getImageURL()+" Added successfully!");
//            List<Product> productList = (List<Product>) this.productRepository.findAll();
//            List<Category> categoryList = (List<Category>) this.categoryRepository.findAll();
//            m.addAttribute("productList",productList);
//            m.addAttribute("categoryList",categoryList);
//        }
//}
