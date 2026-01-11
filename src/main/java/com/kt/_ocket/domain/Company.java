package com.kt._ocket.domain;

import java.util.ArrayList;
import java.util.List;

import com.kt._ocket.common.support.BaseEntity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
public class Company extends BaseEntity {
	private String name;
	private String description;
	private String background;
	private String strengths;

	@OneToMany(mappedBy = "company")
	private List<Service> services = new ArrayList<>();

	@OneToMany(mappedBy = "company")
	private List<Worker> workers = new ArrayList<>();
}
