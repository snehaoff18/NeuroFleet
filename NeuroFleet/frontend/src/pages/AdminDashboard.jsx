import { useNavigate } from "react-router-dom";

function AdminDashboard() {

  const navigate = useNavigate();

  const handleLogout = () => {
    localStorage.removeItem("token");
    navigate("/");
  };

  return (
    <div style={styles.container}>
      <div style={styles.header}>
        <h2>Admin Dashboard</h2>
        <button onClick={handleLogout} style={styles.logoutBtn}>
          Logout
        </button>
      </div>

      <div style={styles.content}>
        <div style={styles.card}>
          <h3>Total Fleet Vehicles</h3>
          <p>Coming Soon 🚗</p>
        </div>

        <div style={styles.card}>
          <h3>Active Fleet Managers</h3>
          <p>Coming Soon 👨‍💼</p>
        </div>

        <div style={styles.card}>
          <h3>Urban Traffic Insights</h3>
          <p>AI Analytics Module Coming Soon 🤖</p>
        </div>
      </div>
    </div>
  );
}

const styles = {
  container: {
    minHeight: "100vh",
    backgroundColor: "#f4f6f8",
    padding: "30px"
  },
  header: {
    display: "flex",
    justifyContent: "space-between",
    alignItems: "center",
    marginBottom: "30px"
  },
  logoutBtn: {
    padding: "8px 15px",
    borderRadius: "6px",
    border: "none",
    backgroundColor: "#dc3545",
    color: "white",
    cursor: "pointer"
  },
  content: {
    display: "grid",
    gridTemplateColumns: "repeat(auto-fit, minmax(250px, 1fr))",
    gap: "20px"
  },
  card: {
    backgroundColor: "white",
    padding: "20px",
    borderRadius: "10px",
    boxShadow: "0 5px 15px rgba(0,0,0,0.1)"
  }
};

export default AdminDashboard;
