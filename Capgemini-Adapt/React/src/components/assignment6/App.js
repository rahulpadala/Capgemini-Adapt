
import React from 'react';
import './App.css';

import { BrowserRouter as Router, Switch, Route ,Link} from 'react-router-dom';
import Home from './components/home';

import Products from './components/products';
import Services from './components/Services';
import Contact from './components/contacts';

function App() {
  const mystyle = {
   float:"center",
   fontSize:"20px",
    padding: "10px",
    fontFamily: "Arial",
    backgroundColor:"pink",
      

  

  };
  


  return (
    
    <Router>

<Link  style={mystyle} to="/products">products</Link>
      <Link style={mystyle} to="/contact">contacts</Link>
      <Link style={mystyle} to="/services">services</Link>


      <Route path="/products" exact strict render={
            ()=>{
              return(<Products/>);
            }
          }/>
  <Route path="/services" exact strict render={
            ()=>{
              return(<Services/>);
            }
          }/>
           <Route path="/contact" exact strict render={
            ()=>{
              return(<Contact/>);
            }
          }/>

    </Router>
  );
}
  
export default App;