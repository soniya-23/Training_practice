// function fruit(name,color)
// {
// this.name = name;
// this.color = color;
// this.tell = () => console.log(this.color+' '+this.name)
// this.shout = function(){ console.log(this.color+' '+this.name); }
// }
 
// let apple = new fruit('Apple','Red');
 
// console.log(typeof apple)
// apple.tell()
// apple.shout()
 
// console.log('\n')
 
// let person = {
//  age: 30,
//  name : 'Alice',
//  tell : () => console.log(this.name, this.age),
//  shout : function(){ console.log(this.name,this.age); }
// }
// console.log(typeof person)
 
// person.tell()
// person.shout()
// var r={
//     name:"sonu",
//     age:20
// };
// function show(){
//     console.log(this.name+" "+this.age);
// }
// show();
var person = {
    fullName: function() {
      return this.firstName + " " + this.lastName;
    }
  }
  var person1 = {
    firstName:"John",
    lastName: "Doe"
  }
  var person2 = {
    firstName:"Mary",
    lastName: "Doe"
  }
  person.fullName.call(person2); 