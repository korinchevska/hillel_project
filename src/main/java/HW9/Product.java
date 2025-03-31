package HW9;

public class Product {
    String productName;
    int articleProduct;
    double priceProduct;
    String descriptionProduct;
    boolean availability;

    public String getName(){
        return productName;
    }
    public void setName(String productName) {
        this.productName = productName;
    }
    public int getArticle(){
        return articleProduct;
    }
    public void setArticle(int articleProduct){
        this.articleProduct = articleProduct;
    }
    public double getPriceProduct(){
        return priceProduct;
    }
    public void setPriceProduct(int priceProduct){
        this.priceProduct = priceProduct;
    }
    public String getDescriptionProduct(){
        return productName;
    }
    public void setDescriptionProduct(String descriptionProduct) {
        this.descriptionProduct = descriptionProduct;
    }

    public boolean isAvailability() {
        return availability;
    }
    public void setAvailability() {
        this.availability = availability;
    }
}
