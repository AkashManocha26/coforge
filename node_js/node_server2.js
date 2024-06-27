var http=require('http')
http.createServer((req,resp)=>{
    resp.writeHead(200,{'Content-Type':'text/html'})
    resp.write("<h2>My Clock</h2>")

    setInterval(()=>resp.write(new Date().toTimeString()),1000)
    resp.write('<p>hello world')
}).listen(5000)
console.log('server running')