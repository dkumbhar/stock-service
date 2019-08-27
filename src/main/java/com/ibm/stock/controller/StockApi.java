/**
 * NOTE: This class is auto generated by the swagger code generator program ().
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.ibm.stock.controller;

import com.ibm.stock.model.Stock;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Api(value = "stock", description = "The Stock API")
public interface StockApi {

    @ApiOperation(value = "", notes = "Delete product by ID", response = Stock.class, tags={ "stock", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "One product", response = Stock.class) })
    @RequestMapping(value = "/stock/{id}",
        produces = { "application/json" }, 
        consumes = { "text/plain" },
        method = RequestMethod.DELETE)
    ResponseEntity<Stock> delete(@ApiParam(value = "Product ID", required = true) @PathVariable("id") Long id, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "", notes = "Get product by ID", response = Stock.class, tags={ "stock", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "One product", response = Stock.class) })
    @RequestMapping(value = "/stock/{id}",
        produces = { "application/json" }, 
        consumes = { "text/plain" },
        method = RequestMethod.GET)
    ResponseEntity<Stock> get(@ApiParam(value = "Product ID", required = true) @PathVariable("id") Long id, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "", notes = "Update product by ID", response = Stock.class, tags={ "stock", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "One product", response = Stock.class) })
    @RequestMapping(value = "/stock/{id}",
        produces = { "application/json" }, 
        consumes = { "text/plain" },
        method = RequestMethod.PUT)
    ResponseEntity<Stock> update(@ApiParam(value = "Product ID", required = true) @PathVariable("id") Long id, @ApiParam(value = "Product name", required = true) @Valid @RequestBody String productName, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}