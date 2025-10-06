/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package medicsmain;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * NUR LIYANA BINTI MOHD ABDUL RAHMAN (CA21033)
 * SECTION 2 
 * MEDICAL SUPPLIES
 * 
 */

public class ShipmentDAO {

    public void addShipment(MedicsShipment shipment) {
        String sql = "INSERT INTO medicalsupply (id, s_name, s_address, s_phone, r_name, r_address, r_phone, description, weight, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, shipment.getId());
            stmt.setString(2, shipment.getSenderName());
            stmt.setString(3, shipment.getSenderAddress());
            stmt.setString(4, shipment.getSenderPhone());
            stmt.setString(5, shipment.getReceiverName());
            stmt.setString(6, shipment.getReceiverAddress());
            stmt.setString(7, shipment.getReceiverPhone());
            stmt.setString(8, shipment.getDescription());
            stmt.setDouble(9, shipment.getWeight());
            stmt.setString(10, shipment.getStatus());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void editShipment(MedicsShipment shipment) {
        String sql = "UPDATE medicalsupply SET s_name = ?, s_address = ?, s_phone = ?, r_name = ?, r_address = ?, r_phone = ?, description = ?, weight = ?, status = ? WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, shipment.getSenderName());
            stmt.setString(2, shipment.getSenderAddress());
            stmt.setString(3, shipment.getSenderPhone());
            stmt.setString(4, shipment.getReceiverName());
            stmt.setString(5, shipment.getReceiverAddress());
            stmt.setString(6, shipment.getReceiverPhone());
            stmt.setString(7, shipment.getDescription());
            stmt.setDouble(8, shipment.getWeight());
            stmt.setString(9, shipment.getStatus());
            stmt.setInt(10, shipment.getId());

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void deleteShipment(int id) {
        String sql = "DELETE FROM medicalsupply WHERE id = ?";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, id);
            int rowsAffected = stmt.executeUpdate();

            if (rowsAffected > 0) {
                System.out.println("Shipment deleted successfully with ID: M" + String.format("%03d", id));
            } else {
                System.out.println("No shipment found with ID: M" + String.format("%03d", id));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<MedicsShipment> getAllShipments() {
        List<MedicsShipment> shipments = new ArrayList<>();
        String sql = "SELECT * FROM medicalsupply";

        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {

            while (rs.next()) {
                int id = rs.getInt("id");
                String senderName = rs.getString("s_name");
                String senderAddress = rs.getString("s_address");
                String senderPhone = rs.getString("s_phone");
                String receiverName = rs.getString("r_name");
                String receiverAddress = rs.getString("r_address");
                String receiverPhone = rs.getString("r_phone");
                String description = rs.getString("description");
                double weight = rs.getDouble("weight");
                String status = rs.getString("status");

                MedicsShipment shipment = new MedicsShipment(id, senderName, senderAddress, senderPhone, receiverName, receiverAddress, receiverPhone, description, weight, status);
                shipments.add(shipment);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return shipments;
    }

    public MedicsShipment getShipmentById(String formattedId) {
        try {
            int numericId = extractNumericId(formattedId); // Convert "M001" to numeric ID
            MedicsShipment shipment = null;
            String sql = "SELECT * FROM medicalsupply WHERE id = ?";

            try (Connection conn = DatabaseConnection.getConnection();
                 PreparedStatement stmt = conn.prepareStatement(sql)) {

                stmt.setInt(1, numericId);
                try (ResultSet rs = stmt.executeQuery()) {
                    if (rs.next()) {
                        String senderName = rs.getString("s_name");
                        String senderAddress = rs.getString("s_address");
                        String senderPhone = rs.getString("s_phone");
                        String receiverName = rs.getString("r_name");
                        String receiverAddress = rs.getString("r_address");
                        String receiverPhone = rs.getString("r_phone");
                        String description = rs.getString("description");
                        double weight = rs.getDouble("weight");
                        String status = rs.getString("status");

                        shipment = new MedicsShipment(numericId, senderName, senderAddress, senderPhone, receiverName, receiverAddress, receiverPhone, description, weight, status);
                    }
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

            return shipment;
        } catch (NumberFormatException e) {
            return null; // Handle invalid ID format gracefully
        }
    }
    
    // Utility method to extract numeric ID from formatted ID "M001"
    private int extractNumericId(String formattedId) throws NumberFormatException {
        return Integer.parseInt(formattedId.substring(1)); // Remove 'M' and parse to int
    }
}