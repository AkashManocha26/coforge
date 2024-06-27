var express=require('express')

var app=express()
app.get("/",(req,resp)=>{
    resp.write("<h1>Hello Express Application</h1>")
})

app.get("/employee",(req,resp)=>{
    resp.json(employee)
})


app.listen(7000)
console.log('express app running')

var employee={
    "eid":1001,
    "ename":"Akash Manocha",
    "district":"Rohtak",
    "state":"Haryana",
    "country":"India"
}