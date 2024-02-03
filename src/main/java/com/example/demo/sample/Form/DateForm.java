package com.example.demo.sample.Form;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;

@Data

public class DateForm {
	
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	Date message ;

}
