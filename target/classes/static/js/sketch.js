let points = []

let timerID = setInterval(() => {
    fetchallPoints();
}, 5000);

function fetchallPoints(){
    fetch("/api/fetchAll", {
        method:"GET",
        headers:{
            "Content-Type":"appliication/json"
        }
    })
    .then(res => res.json())
    .then(data => {
        if(data){
            points = data;
        }

    }).catch(error => console.log(error));
}

function addPoint(point){
    fetch("/api/addPoint", {
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(point)
    }).then(res => {
        //users.push({ip: ip, point: point});
    }).catch(error => console.log(error));
}

function setup() {
    createCanvas(800, 600);
}

// Esta función se ejecuta repetidas veces indefinidamente.
function draw() {
    points.map((point) => {
        let color = point.color.split(",");
        fill(color[0], color[1], color[2]);
        ellipse(point.x, point.y, 20, 20);
    })
    if (mouseIsPressed === true) {
        fill(0,0,0);
        ellipse(mouseX, mouseY, 20, 20);
        addPoint({x: mouseX, y: mouseY, color:"0,0,0"});
    }
    if (mouseIsPressed === false) {
        fill(255, 255, 255);
    }
}