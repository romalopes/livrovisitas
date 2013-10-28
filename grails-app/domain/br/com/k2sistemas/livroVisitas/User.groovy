package br.com.k2sistemas.livroVisitas

class User {
	
	static searchable = true
	
  String name
  String email
  String webpage

	static constraints = {
		name (blank:false, nullable:false, size:3..30, matches:"[a-zA-Z1-9_]+")
		email (email:true)
		webpage (url:true)
	}
  
  String toString(){
	return name;
  }
}