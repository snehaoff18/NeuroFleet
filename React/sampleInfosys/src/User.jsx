import React from 'react'

function User({name,age,phoneno,email}) {
  return (<div>
    <h2>{name}</h2>
    <h3>{age}</h3>
    <h4>{phoneno}</h4>
    <h5>{email}</h5>
    </div>);  
}

export default User;
