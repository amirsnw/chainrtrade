package productservice.command.rest;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CreateProductRestModel {

    @NotBlank(message = "Product title is a required field")
    private String title;

    @Min(value = 1, message = "Price can not be lower then 1")
    private BigDecimal price;

    @Min(value = 1, message = "Quantity can not lower then 1")
    @Max(value = 5, message = "Quantity can not larger then 5")
    private Integer quantity;

}
