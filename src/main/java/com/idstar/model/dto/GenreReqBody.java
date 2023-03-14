package com.idstar.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class GenreReqBody {

	private String nameIndex;
	private Boolean allIndex;

	public String getNameIndex() {
		return nameIndex;
	}

	public Boolean getAllIndex() {
		return allIndex;
	}
}
