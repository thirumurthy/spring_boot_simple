package com.thirutricks.my_notes.dto;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
public class CreateUser {
	@ApiModelProperty(example = "User Test")
    @NotBlank
    private String name;

    @ApiModelProperty(example = "user@test.com", position = 2)
    @Email
    @NotBlank
    private String email;

}
