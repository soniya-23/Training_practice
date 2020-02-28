let styles = ["Jazz", "Blues"];
styles.push("Rock-n-Roll");
styles[Math.floor((styles.length - 1) / 2)] = "Classics";
alert( styles.shift() );
styles.unshift("Rap", "Reggae");
let arr=[1,2,3,4];

for(let i=0;i<arr.length;i++)
  {
    console.log(arr[i]);
  }
//using array object

let arr1=new Array();
arr[0]=1;
arr[1]=2;
arr[3]=3;
console.log(arr[0]+" "+arr[1]+" "+arr[2]);

//by using array constructor

let arr2=new Array("soniya","ramana","madhesh");
for(let i=0;i<arr2.length;i++)
  {
    console.log(arr2[i]);
  }