package com.decipherzone.dynamodb.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAutoGeneratedKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;

@DynamoDBTable(tableName = "ProductInfo")
public class ProductInfo {
    private String id;
    private String cost;

    public ProductInfo() {
    }

    public ProductInfo(String cost) {
        this.cost = cost;
    }

    @DynamoDBHashKey
    @DynamoDBAutoGeneratedKey
    public String getId() {
        return id;
    }

    @DynamoDBAttribute
    public String getCost() {
        return cost;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }
}