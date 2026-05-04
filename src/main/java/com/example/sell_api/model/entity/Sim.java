package com.example.sell_api.model.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@Document(collection = "sim")
@AllArgsConstructor
@NoArgsConstructor
public class Sim extends MongoBaseEntity {
    @MongoId
    private ObjectId id;
    @Indexed(unique = true)
    @Field(name = "sim_id")
    private String simId;
    /* e sim or normal sim*/
    private String type;
    /* vina, mobile, viettel v.v.v */
    private String brand;
    private String nation;
    private String number;
    @Field(name = "expire_date")
    private String expireDate;
    private long price;
    @Field(name = "qr_code")
    private String qrCode;
}
