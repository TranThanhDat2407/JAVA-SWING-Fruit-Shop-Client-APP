/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import Entity.WishList;
import java.sql.PreparedStatement;
import java.util.List;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import utils.jdbcHelper;

/**
 *
 * @author PC
 */
public class WishListDAO extends EduSysDAO<WishList, Integer>{
    final String INSERT_SQL = "INSERT INTO Wishlist (user_id, product_item_id)\n" +
                              "VALUES (?,?);";
    final String UPDATE_SQL = "UPDATE Wishlist SET user_id = ?, product_item_id = ?  WHERE id = ?";
    final String DELETE_SQL = "DELETE FROM Wishlist where id = ?";
    final String SELECT_ALL_SQL = "SELECT * FROM Wishlist";
    final String SELECT_BY_ID_SQL = "SELECT * FROM Wishlist where id = ?";
     final String DELETE_SQL_BY_IdUser_IdPrItem = "DELETE FROM WishList WHERE user_id = ? AND product_item_id = ?";
    @Override
    public void insert(WishList entity) {
        jdbcHelper.update(INSERT_SQL, entity.getUser_id(), entity.getProduct_item_id());
    }

    @Override
    public void update(WishList entity) {
        jdbcHelper.update(UPDATE_SQL, entity.getUser_id(), entity.getProduct_item_id(), entity.getId());
    }

    @Override
    public void delete(Integer id) {
        jdbcHelper.update(DELETE_SQL, id);
    }

    @Override
    public List<WishList> selectAll() {
        return selectBySql(SELECT_ALL_SQL);
    }

    @Override
    public WishList selectById(Integer id) {
        List<WishList> list = selectBySql(SELECT_BY_ID_SQL, id);
        if(list.isEmpty())
        {
            return null;
        }
        return list.get(0);
    }

    @Override
    public List<WishList> selectBySql(String sql, Object... args) {
        List<WishList> list = new ArrayList<>();
        try {
            ResultSet rs = jdbcHelper.query(sql, args);
            try {
                while(rs.next())
                {
                    WishList wl = new WishList();
                    wl.setId(rs.getInt("id"));
                    wl.setUser_id(rs.getInt("user_id"));
                    wl.setProduct_item_id(rs.getInt("product_item_id"));
                    list.add(wl);
                }
            } finally {
                rs.getStatement().getConnection().close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            throw new RuntimeException(e);
        }
        return list;
    }
    
    public List<WishList> getListByIdUser(int idUser){
        String sql ="select* from WishList where user_id = ? ";
        List<WishList> listResults = selectBySql(sql, idUser);
        if(listResults.isEmpty())
        {
            return null;
        }
        return listResults;
    }
    
     public int countItemWishList(int userId) {
        String sql = "select count(product_item_id) from WishList where user_id = ?";
        try {
            PreparedStatement stmt = jdbcHelper.getStmt(sql, userId);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return rs.getInt(1);
            }
            rs.getStatement().getConnection().close();
            return 0;
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
     
     
  public List<Object[]> getListProductItemWishList(int id_user) {
    List<Object[]> listResults = new ArrayList<>();
    String sql = "exec fillItemWishList @user_id = ?";
    
    try (PreparedStatement preparedStatement = jdbcHelper.getStmt(sql, id_user);
         ResultSet rs = preparedStatement.executeQuery()) {
        
      
        while (rs.next()) {
            
            int columnCount = rs.getMetaData().getColumnCount();
            Object[] row = new Object[columnCount];
            for (int i = 0; i < columnCount; i++) {
                row[i] = rs.getObject(i + 1);  
            }
            listResults.add(row);
        }
    } catch (Exception e) {
        e.printStackTrace(); // Hoặc xử lý lỗi theo cách bạn muốn
    }
    
    return listResults;
  
}
    
     public void deleteBy_UserID_ProductID(int idUser,int idPr) {
        jdbcHelper.update(DELETE_SQL_BY_IdUser_IdPrItem, idUser,idPr);
    }

     
     
     
     
    public static void main(String[] args) {
        WishListDAO dao = new WishListDAO();
        dao.deleteBy_UserID_ProductID(1, 2);
          System.out.println("DELETED");
     
    }
    
}
