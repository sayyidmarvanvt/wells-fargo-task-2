package com.wellsfargo.counselor.entity;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class Security {
    

    @Id
    @GeneratedValue
    public long securityId;

    @ManyToOne
    public Portfolio portfolio;

    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String category;
    @Column(nullable = false)
    private Integer purchasePrice;
    @Column(nullable = false)
    private String purchaseDate;
    @Column(nullable = false)
    private Integer quantity;

    protected Security(){

    }

    public Security(Portfolio portfolio,String name,String category,Integer purchasePrice,String purchaseDate,Integer quantity){
        this.portfolio=portfolio;
        this.name=name;
        this.category=category;
        this.purchaseDate=purchaseDate;
        this.purchasePrice=purchasePrice;
        this.quantity=quantity;
    }

    public Long getSecurityId(){
        return securityId;
    }
    
    public Portfolio getPortfolio(){
        return portfolio;
    }
     public void setPorfolio(Portfolio portfolio){
        this.portfolio=portfolio;
     }

     public String getName(){
        return name;
     }

     public void setName(String name)
     {
        this.name=name;
     }
     public String getCategory(){
        return category;
     }

     public void setCategory(String category)
     {
        this.category=category;
     }
     public String getPurchaseDate(){
        return purchaseDate;
     }

     public void setPurchaseDate(String purchaseDate)
     {
        this.purchaseDate=purchaseDate;
     }

     public Integer getPurchasePrice(){
return purchasePrice;
     }

     public void setPurchasePrice(Integer purchasePrice){
         this.purchasePrice=purchasePrice;
     }
     public Integer getQuantity(){
return quantity;
     }

     public void setQuantity(Integer quantity){
         this.quantity=quantity;
     }
}

