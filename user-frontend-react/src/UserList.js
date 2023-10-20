// src/UserList.js
import React, { useState, useEffect } from 'react';

function UserList() {
  const [users, setUsers] = useState([]);

  useEffect(() => {
    const fetchData = async () => {
      try {
        const response = await fetch('http://localhost:8080/usuarios', {
          method: 'GET',
          headers: {
            'Authorization': 'Bearer YourAuthTokenHere', // Replace with your authentication token.
            'Content-Type': 'application/json',
          },
        });

        if (!response.ok) {
          throw new Error('Network response was not ok');
        }

        const data = await response.json();
        setUsers(data);
      } catch (error) {
        console.error('Error:', error);
      }
    };

    fetchData();
  }, []);

  return (
    <div>
      <h2>User List</h2>
      <ul>
        {users.map((user) => (
          <li key={user.id}>
            {user.id} - {user.nombre} - {user.cargo}
          </li>
        ))}
      </ul>
    </div>
  );
}

export default UserList;
