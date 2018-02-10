package guru.springframework.commands;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.math.BigDecimal;

/**
 * Created by Ben Novikov on 2018, February, 09
 *
 1. Create a new ProductForm object. This should have id, version, description, price, and image url.
    Properties should match Product domain class.
 2. Description cannot be blank, and must be more than 5 characters, but less than 200.
 3. Price must be a number greater than zero, less than 5000.
 4. Use HTML 5 to limit input of price as a number.
 5. Image URL string must be a valid URL.
 */
public class ProductForm {
    private Integer id;
    private Integer version;

    @NotEmpty
    @Size(min = 5, max = 200)
    private String description;
    @NotNull
    @Min(0)
    @Max(5000)
    private BigDecimal price;
    @NotEmpty
    @URL
    private String imageUrl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
