let arr=["monday","tuesday","thursday","friday"];
console.log("original array");
for(let i=0;i<arr.length;i++)
  {
    
    console.log(arr[i]);
  }
var result_shift=arr.shift();//removes 1st element
console.log("after shift operation 1st element is deleted");
console.log(result_shift);
console.log("resultant array");
for(let i=0;i<arr.length;i++)
  {
    
console.log(arr[i]);
  }
let result_slice=arr.slice(1,2);
console.log(result_slice);//returns the specified indexed array it will not modify the original array
console.log("resultant array");
for(let i=0;i<arr.length;i++)
  {
    
console.log(arr[i]);
  }
let result_splice=arr.splice(1,0,"wednesday");//splice adds/removes array elements
console.log(result_splice);//returns the specified indexed array it will not modify the original array
console.log("resultant array");
for(let i=0;i<arr.length;i++)
  {
    
console.log(arr[i]);
  }