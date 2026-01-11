package com.kt._ocket.domain;

import com.kt._ocket.common.support.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Story extends BaseEntity {
	private String discovery;
	private String idea;
	private String direction;
	private String message;

	@OneToOne
	@JoinColumn(name = "company_id")
	private Company company;
}