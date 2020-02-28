let selectedcolors=['red','blue'];
selectedcolors[2]=9;
console.log(selectedcolors.lengt);
var v=100;        //global variable
function call(){
  
  console.log(v);
  cal2();
  call1();
}
function call1(){
  console.log(v);
}
function cal2(){
  v1=200;          //local variable
  console.log(v1);
}
console.log(v);
call();
