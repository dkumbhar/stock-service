/**
 * NOTE: This class is auto generated by the swagger code generator program ().
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package com.ibm.stock.service;

import com.ibm.stock.model.Product;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;
import javax.validation.Valid;
@javax.annotation.Generated(value = "com.ibm.mobile.sdkgen.platform.JavaSpringBootCodegenConfig", date = "2017-10-21T21:39:11.308Z")

@Api(value = "products", description = "the products API")
public interface ProductsApi {

    @ApiOperation(value = "", notes = "Add new product", response = Product.class, tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "One product", response = Product.class) })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        consumes = { "text/plain" },
        method = RequestMethod.POST)
    ResponseEntity<Product> add(@ApiParam(value = "Product name", required = true) @Valid @RequestBody String productName, @RequestHeader(value = "Accept", required = false) String accept) throws Exception;


    @ApiOperation(value = "", notes = "Get all products", response = Product.class, responseContainer = "List", tags={ "products", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of all products", response = Product.class, responseContainer = "array") })
    @RequestMapping(value = "/products",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<List<Product>> getAll(@RequestHeader(value = "Accept", required = false) String accept) throws Exception;

}
