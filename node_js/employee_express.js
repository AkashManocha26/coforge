var employee=require('./data/employee')
var express=require('express')
var app=express()
app.use(express.json())
app.get("/",(req,resp)=>{
    resp.send("<h1>Employee Application</h1>")
})
app.get("/all",(req,resp)=>{
    resp.json(employee)
})
app.get("/all/:eid",(req,resp)=>{
    if(!req.params.eid || isNaN(req.params.eid))
        return resp.status(404).send('invalid id or id is not a number')
    var e=employee.find(a=>{
        return a.id===parseInt(req.params.eid)
    })
    if(!e){
        return resp.status(404).send("id not found")
    }
    return resp.status(302).send(e)

})
app.delete("/all/:eid",(req,resp)=>{
    if(!req.params.eid || isNaN(req.params.eid))
        return resp.status(404).send('invalid id or id is not a number')
    var e=employee.find(a=>{
        return a.id===parseInt(req.params.eid)
    })
    if(!e){
        return resp.status(404).send("id not found")
    }
    
    if(e){
        let index=employee.indexOf(e)
        let emp1=employee.splice(index,1)
        return resp.status(202).json(emp1)
    }

})

app.post("/all",(req,resp)=>{
    const emp_new={
        "id":req.body.id,
        "name":req.body.name,
        "salary":req.body.salary,
        "dob":req.body.dob,
    }
    if(!emp_new.id)
        return resp.status(400).send('add the id')
    else if(!emp_new.name)
        return resp.status(400).send('add the name')
    else if(!emp_new.salary)
        return resp.status(400).send('add the salary')
    else if(!emp_new.dob)
        return resp.status(400).send('add the dob')
    else{
        employee.push(emp_new);
        return resp.status(201).json(emp_new)
    }
})
app.put("/all",(req,resp)=>{
    
    if(!req.body.id)
        return resp.status(400).send('add the id')
    else if(!req.body.name)
        return resp.status(400).send('add the name')
    else if(!req.body.salary)
        return resp.status(400).send('add the salary')
    else if(!req.body.dob)
        return resp.status(400).send('add the dob')
    var id1=req.body.id
    var emp1=employee.find((a)=>{
        return a.id===parseInt(id1)
    })
    if(!emp1)
        return resp.status(404).send('employee not present with the given id')
    else{
        var index=employee.indexOf(emp1)
        emp1.name=req.body.name
        emp1.salary=req.body.salary
        emp1.dob=req.body.dob
        return resp.status(201).json(emp1)
    }
})

app.listen(1080)