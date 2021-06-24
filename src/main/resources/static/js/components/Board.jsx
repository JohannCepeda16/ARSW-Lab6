class Board extends React.Component{
    
    render(){
        return (
            <div>
                <h1 style={{textAlign:"center"}}>Tablero interactivo</h1>
            </div>
        )
    }
}

ReactDOM.render(
    <Board />, document.getElementById("root")
)