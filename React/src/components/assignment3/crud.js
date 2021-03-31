import React, { useState } from 'react';

function Crud(){

const[persons,setPersons]=useState([])
const [input, setInput] = useState({
    name: "",
    number: ""
  });

const addPerson = input => {
    setPersons([...persons, { name: input.name, number: input.number }]);
  };
  const handleSubmit = e => {
    e.preventDefault();
    addPerson(input);
  };
  function handleRemove(id) {
    const newList = persons.filter((item) => item.name !== id);
 
    setPersons(newList);
  }
  const handleChange = e => {
    setInput({
      ...input,
      [e.target.name]: e.target.value
    });
  };


return (
<div>
<form >
      <div>
        Name:
        <input
          name="name"
          type="text"
          value={input.name}
          onChange={handleChange}
        />
      </div>
      <div>
        job
        <input
          name="number"
          type="text"
          value={input.number}
          onChange={handleChange}
        />
      </div>
   
      <div>
      <button onClick={handleSubmit}>submit</button>
      </div>
      <hr />
      {persons.map(item => (
        <p >
        <span>{item.name}</span>
          <span>{item.number}</span>
          <button type="button" onClick={() => handleRemove(item.name)}>
            Remove
          </button>
        </p>
      ))}
    </form>
  

</div>
)

}
export default Crud;
