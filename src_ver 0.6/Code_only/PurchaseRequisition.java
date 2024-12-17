/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Code_only;

/**
 *
 * @author thong
 */
public class PurchaseRequisition {
    private String requisitionId;
    private String itemCode;
    private int quantity;
    private String requiredDate;
    private String salesManagerId;

    public PurchaseRequisition(String requisitionId, String itemCode, int quantity, String requiredDate, String salesManagerId) {
        this.requisitionId = requisitionId;
        this.itemCode = itemCode;
        this.quantity = quantity;
        this.requiredDate = requiredDate;
        this.salesManagerId = salesManagerId;
    }

    // Getters and setters
}

