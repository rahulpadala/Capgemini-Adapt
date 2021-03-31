import React ,{useState,useEffect} from 'react'
import Switch from 'react-toggle-switch'
function Clock() {

    const [clockState, setClockState] = useState(new Date())
    const [show,setShow] = useState(false)

    useEffect(() =>  setInterval(() => setClockState(new Date()),1000))

    function showDate(){

        const curr = new Date().toLocaleDateString();
        return curr
    
    }
    return (
    <div>
        <div >
            <Switch onClick={()=>setShow(!show)}> get Date</Switch>
            <p  style={{fontSize:"50px", margin:"20px"}}>{clockState.toLocaleTimeString()}</p>
      
        <div>
            { 
                show ? <p>{clockState.toLocaleDateString()}</p> : null 
            }
        </div>
          </div>
    </div>        
    )
}


export default Clock