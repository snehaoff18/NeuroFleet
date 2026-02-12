import User from './User.jsx';

function App(){
  const userData={
    name :"Ray",
    age:15,
    phoneno:"9842545458",
    email:"ray@gmail.com"
  };
  return (<div> 
    <h1>Hi</h1>
    <User {...userData}/>
     </div>);
}


export  default App;