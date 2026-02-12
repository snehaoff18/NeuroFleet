function CustomerDashboard() {
  return (
    <div style={styles.container}>
      <h2>Customer Dashboard</h2>
      <p>Welcome! Book vehicles and track rides here 🚕</p>
    </div>
  );
}

const styles = {
  container: {
    minHeight: "100vh",
    display: "flex",
    flexDirection: "column",
    justifyContent: "center",
    alignItems: "center",
    backgroundColor: "#f4f6f8"
  }
};

export default CustomerDashboard;
