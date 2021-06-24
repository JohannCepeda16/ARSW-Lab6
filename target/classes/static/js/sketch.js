let timerID = setInterval(() => {
    fetchallPoints();
}, 5000);

let users = []

function fetchallPoints(){
    fetch("/api/fetchAll", {
        method:"GET",
        headers:{
            "Content-Type":"appliication/json"
        }
    })
    .then(res => res.json())
    .then(data => {
        console.log(data);
    }).catch(error => console.log(error));
}

function addPoint(ip, point){
    fetch("/api/addPoint?ip=" + JSON.stringify(ip), {
        method:"POST",
        headers:{
            "Content-Type":"application/json"
        },
        body:JSON.stringify(point)
    }).then(res => {
        users.push({ip: ip, point: point});
    }).catch(error => console.log(error));
}

function setup() {
    createCanvas(800, 600);
}

// Esta función se ejecuta repetidas veces indefinidamente.
function draw() {
    if (mouseIsPressed === true) {
        fill(0, 0, 0);
        ellipse(mouseX, mouseY, 20, 20);
        addPoint("localhost2", {x: mouseX, y: mouseY});
    }
    if (mouseIsPressed === false) {
        fill(255, 255, 255);
    }
}