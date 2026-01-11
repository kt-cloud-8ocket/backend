package com.kt._ocket.domain;

import com.kt._ocket.common.support.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Worker extends BaseEntity {
	private String name;
	private String role;
	private String field;

	@ManyToOne
	@JoinColumn(name = "company_id")
	private Company company;
}
