package com.polovyi.ivan.tutorials.entity;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBAttribute;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTable;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBTypeConverted;
import com.polovyi.ivan.tutorials.entity.converter.LocalDateTimeConverter;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Builder
@Data
@NoArgsConstructor
@AllArgsConstructor
@DynamoDBTable(tableName = "customer")
public class CustomerEntity {

    @DynamoDBHashKey(attributeName = "id")
    private String id;

    private String phoneNumber;

    private String fullName;

    private String address;

    @DynamoDBTypeConverted(converter = LocalDateTimeConverter.class)
    private LocalDate createdAt;

}