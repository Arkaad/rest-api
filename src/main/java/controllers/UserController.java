package controllers;

import model.Product;
import model.ProductDetails;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

/**
 * Created by Arka on 19-Nov-18.
 */
@Path("/users")
public class UserController {
    @Path("/all")
    @GET
    @Produces("application/json")
    public JsonArray getAll() {
        JsonArrayBuilder builder = Json.createArrayBuilder();
        builder.add(Json.createObjectBuilder().add("name", "Arka Dutta"));
        builder.add(Json.createObjectBuilder().add("email", "arka.dutta@globalids.com"));
        return builder.build();
    }

    @Path("/product")
    @GET
    @Produces("application/json")
    public Product getProductDetails() {
        Product obj = new Product();
        obj.setProductName("MacBook");
        ProductDetails productDetails = new ProductDetails();
        productDetails.setQuantity(45);
        productDetails.setPrice(4589.30);
        productDetails.setStock(12);
        obj.setProductDetails(productDetails);
        return obj;
    }
}
