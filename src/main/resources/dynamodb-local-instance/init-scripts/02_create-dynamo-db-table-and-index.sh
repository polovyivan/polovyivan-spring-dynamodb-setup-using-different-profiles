#!/bin/bash

echo "########### Creating table with global secondary index ###########"
aws   $AWS_ENDPOINT \
      dynamodb create-table \
         --table-name customers \
         --attribute-definitions \
           AttributeName=id,AttributeType=S \
        --key-schema AttributeName=id,KeyType=HASH \
        --provisioned-throughput ReadCapacityUnits=5,WriteCapacityUnits=5

echo "########### Describing a table ###########"
aws   $AWS_ENDPOINT \
      dynamodb describe-table --table-name customers --output table

echo "########### Inserting test data into a table ###########"
aws   $AWS_ENDPOINT \
      dynamodb put-item --table-name customers --item "{\"id\":{\"S\":\"29ae2e26-76df-4211-a8e8-f26f11b11588\"},
                                                     \"phoneNumber\":{\"S\":\"1-962-894-4629\"},
                                                     \"fullName\":{\"S\":\"Jarrod Kub V\"},
                                                     \"address\":{\"S\":\"94912 Kihn Club, Lake Twana, AR 58508\"},
                                                     \"createdAt\":{\"S\":\"2021-09-26\"}}"

echo "########### Selecting all data from a table ###########"
aws   $AWS_ENDPOINT \
      dynamodb scan --table-name customers