package pojo;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Storage {
    private Integer warehouseno;

    private String commodityname;

    private String supplier;

    private String specifications;

    private String specificationunit;

    private Integer number;

    private String unit;

    private Integer price;

    private Date storagdate;

    private String remarks;

    public Integer getWarehouseno() {
        return warehouseno;
    }

    public void setWarehouseno(Integer warehouseno) {
        this.warehouseno = warehouseno;
    }

    public String getCommodityname() {
        return commodityname;
    }

    public void setCommodityname(String commodityname) {
        this.commodityname = commodityname == null ? null : commodityname.trim();
    }

    public String getSupplier() {
        return supplier;
    }

    public void setSupplier(String supplier) {
        this.supplier = supplier == null ? null : supplier.trim();
    }

    public String getSpecifications() {
        return specifications;
    }

    public void setSpecifications(String specifications) {
        this.specifications = specifications == null ? null : specifications.trim();
    }

    public String getSpecificationunit() {
        return specificationunit;
    }

    public void setSpecificationunit(String specificationunit) {
        this.specificationunit = specificationunit == null ? null : specificationunit.trim();
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit == null ? null : unit.trim();
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Date getStoragdate() {
        return storagdate;
    }

    public void setStoragdate(Date storagdate) {
        this.storagdate = storagdate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks == null ? null : remarks.trim();
    }

    @Override
    public String toString() {
        return "Storage{" +
                "warehouseno=" + warehouseno +
                ", commodityname='" + commodityname + '\'' +
                ", supplier='" + supplier + '\'' +
                ", specifications='" + specifications + '\'' +
                ", specificationunit='" + specificationunit + '\'' +
                ", number=" + number +
                ", unit='" + unit + '\'' +
                ", price=" + price +
                ", storagdate=" + storagdate +
                ", remarks='" + remarks + '\'' +
                '}';
    }
}