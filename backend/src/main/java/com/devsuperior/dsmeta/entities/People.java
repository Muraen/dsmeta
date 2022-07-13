package com.devsuperior.dsmeta.entities;

import java.util.Objects;

public class People {
	
	private String name;
	
	private Integer idade;
	
	public People() {
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	@Override
	public int hashCode() {
		return Objects.hash(idade, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		People other = (People) obj;
		return Objects.equals(idade, other.idade) && Objects.equals(name, other.name);
	}
	
	
	
	
	
	
	

}
