import { useState, useEffect } from 'react';
import { useMutation, useQuery } from '@apollo/client';
import { GET_ALL_USERS } from './query/user';
import './App.css';
import { CREATE_USER } from './mutations/user';

function App() {
  const { data, loading, error, refetch } = useQuery(GET_ALL_USERS);
  const [newUser] = useMutation(CREATE_USER);
  const [users, setUsers] = useState([]);
  const [username, setUserName] = useState('');
  const [age, setAge] = useState(0);

  console.log(data)
  useEffect(() => {
    if (!loading) {
      setUsers(data.getAllUsers)
    }
  }, [data, loading]);

  const addUser = (e) => {
    e.preventDefault();

    newUser({
      variables: {
        input: {
          username,
          age: parseInt(age, 10)
        }
      }
    }).then(({ data }) => {
      console.log(data);
      setUserName('');
      setAge(0);
    })
  }

  const getAll = e => {
    e.preventDefault();
    refetch();
  }

  if (loading) {
    return <h1>Loading...</h1>;
  }

  return (
    <div>
      {error}
      <form>
        <input value={username} onChange={e => setUserName(e.target.value)} type="text" />
        <input value={age} onChange={e => setAge(e.target.value)} type='number' />
        <div className='btns'>
          <button onClick={(e) => addUser(e)}>Create</button>
          <button onClick={(e) => getAll(e)}>Get</button>
        </div>
      </form>
      <div>
        {users.map(user =>
          <div className='user'>{user.id}. {user.username} {user.age}</div>
        )}
      </div>
    </div>
  );
}

export default App;
