/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inventory_1_0;

public class Receipt {
    private int id;
    private String receiptNo;
    private String description;
    private String type;
    private String date;
    private byte[] picture;
    
//    Constructor
    public Receipt(int rId, String rNo, String rDesc, String rType, String rDate, byte[] rImg){
        this.id = rId;
        this.receiptNo = rNo;
        this.description = rDesc;
        this.type = rType;
        this.date = rDate;
        this.picture = rImg;
    }
    
    public int getId(){
        return id;
    }
    
    public String getReceiptNo(){
        return receiptNo;
    }
    
    public String getDescription(){
        return description;
    }
    
    public String getType(){
        return type;
    }
    
    public String getDate(){
        return date;
    }
    
    public byte[] getPicture(){
        return picture;
    }
    
}
