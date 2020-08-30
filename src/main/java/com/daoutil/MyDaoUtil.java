package com.daoutil;

import javax.servlet.http.HttpServletResponse;
import java.io.PrintWriter;
import java.sql.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author 信息化管理部-方波
 * @site http://www.cr121.com/
 * @company 中铁十二局集团第一工程有限公司
 * @create 2020-03-24 12:59
 */
public class MyDaoUtil {
    private Connection connection;
    private PreparedStatement preparedStatement;

    private String driver = "com.mysql.jdbc.Driver";
    private String url = "jdbc:mysql://localhost:3306/db_project?characterEncoding=utf-8";
    private String user = "root";
    private String password = "Dx19800602Fb";

    /**
     * 构造方法，在该方法中加载数据库驱动
     */
    public MyDaoUtil() {
        try {
            Class.forName(driver);
        } catch(ClassNotFoundException e) {
            System.out.println("加载数据库 jdbc.Driver 驱动失败！");
            e.printStackTrace();
        }
    }

    /**
     * 功能：创建数据库连接
     *
     * @return
     */
    public Connection open() {
        if(connection == null){
            try {
                connection = DriverManager.getConnection(url, user, password);
            } catch (SQLException e) {
                System.out.println("创建数据库 jdbc.Connection 对象失败！");
                connection=null;
                e.printStackTrace();
            }
        }
        return connection;
    }

    /**
     * 功能：对数据库进行增、删、改、查操作
     * 参数：sql为SQL语句；params为Object数组，里面存储的是为sql表示的SQL语句中"?"占位符赋值的数据
     *
     * @param sql
     * @param params
     */
    public boolean execute(String sql, Object[] params) {
        if(sql != null && !sql.equals("")) {
            if(params == null) {
                params = new Object[0];
            }
            open();
            if(connection != null) {
                try {
                    System.out.println(sql);
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    for(int i=0; i<params.length; i++) {
                        preparedStatement.setObject(i+1, params[i]);
                    }
                    return preparedStatement.execute();
                } catch(SQLException e) {
                    System.out.println("执行 doPreparedStatement() 方法出错！");
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

    /**
     * 功能：对数据库进行增、删、改、查操作
     * 参数：sql为SQL语句
     *
     * @param sql
     */
    public boolean execute(String sql) {
        if(sql != null && !sql.equals("")) {
            open();
            if(connection != null) {
                try {
                    System.out.println(sql);
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    return preparedStatement.execute();
                } catch(SQLException e) {
                    System.out.println("执行 doPreparedStatement() 方法出错！");
                    e.printStackTrace();
                }
            }
        }

        return false;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回的ResultSet结果集
     *
     * @param sql
     * @param params
     * @return
     */
    public ResultSet getResultSet(String sql, Object[] params) {
        if(sql != null && !sql.equals("")) {
            if(params == null) {
                params = new Object[0];
            }
            open();
            if(connection != null) {
                try {
                    System.out.println(sql);
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    for(int i=0; i<params.length; i++) {
                        preparedStatement.setObject(i+1, params[i]);
                    }
                    return preparedStatement.executeQuery();
                } catch(SQLException e) {
                    System.out.println("获取数据库 ResultSet 对象失败！");
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回的ResultSet结果集
     *
     * @param sql
     * @return
     */
    public ResultSet getResultSet(String sql) {
        if(sql != null && !sql.equals("")) {
            open();
            if(connection != null) {
                try {
                    System.out.println(sql);
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    return preparedStatement.executeQuery();
                } catch(SQLException e) {
                    System.out.println("获取数据库 ResultSet 对象失败！");
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回的ResultSet行数
     *
     * @param tbl
     * @return
     */
    public long getResultCount(String tbl) {
        if(tbl != null && !tbl.equals("")) {
            open();
            if(connection != null) {
                try {
                    System.out.println(tbl);
                    preparedStatement = connection.prepareStatement("select count(0) from "+tbl, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet != null && resultSet.next()) {
                        return resultSet.getLong(1);
                    }
                } catch(SQLException e) {
                    System.out.println("获取数据库 ResultSet 对象失败！");
                    e.printStackTrace();
                }
            }
        }

        return -1;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回的ResultSet结果集
     *
     * @return
     */
    public ResultSet getResultSet() {
        try {
            return preparedStatement.getResultSet();
        } catch (SQLException e) {
            System.out.println("获取数据库 ResultSet 对象失败！");
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回的List结果集
     *
     * @param sql
     * @param params
     * @return
     */
    public List<Map> getResultSetList(String sql, Object[] params) {
        if(sql != null && !sql.equals("")) {
            if(params == null) {
                params = new Object[0];
            }
            open();
            if(connection != null) {
                try {
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    for(int i=0; i<params.length; i++) {
                        preparedStatement.setObject(i+1, params[i]);
                    }

                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet != null) {
                        List list = new ArrayList();
                        ResultSetMetaData rsMetaData = resultSet.getMetaData();
                        if (rsMetaData != null) {
                            int columns = rsMetaData.getColumnCount();
                            while (resultSet.next()) {
                                Map map = new HashMap();
                                for (int column = 1; column <= columns; column++) {
                                    map.put(rsMetaData.getColumnName(column), resultSet.getObject(column));
                                }
                                list.add(map);
                            }
                            resultSet.close();

                            return list;
                        }
                    }
                } catch(SQLException e) {
                    System.out.println("获取数据库 ResultSet 对象失败！");
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回的List结果集
     *
     * @param sql
     * @return
     */
    public List<Map> getResultSetList(String sql) {
        if(sql != null && !sql.equals("")) {
            open();
            if(connection != null) {
                try {
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet != null) {
                        List list = new ArrayList();
                        ResultSetMetaData rsMetaData = resultSet.getMetaData();
                        if (rsMetaData != null) {
                            int columns = rsMetaData.getColumnCount();
                            while (resultSet.next()) {
                                Map map = new HashMap();
                                for (int column = 1; column <= columns; column++) {
                                    map.put(rsMetaData.getColumnName(column), resultSet.getObject(column));
                                }
                                list.add(map);
                            }
                            resultSet.close();

                            return list;
                        }
                    }
                } catch(SQLException e) {
                    System.out.println("获取数据库 ResultSet 对象失败！");
                    e.printStackTrace();
                }
            }
        }

        return null;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回的List结果集
     *
     * @return
     */
    public List<Map> geResultSetList() {
        try {
            ResultSet resultSet = preparedStatement.getResultSet();

            if(resultSet != null) {
                List list = new ArrayList();
                ResultSetMetaData rsMetaData = resultSet.getMetaData();
                if(rsMetaData != null) {
                    int columns = rsMetaData.getColumnCount();
                    while (resultSet.next()) {
                        Map map = new HashMap();
                        for (int column = 1; column <= columns; column++) {
                            map.put(rsMetaData.getColumnName(column),resultSet.getObject(column));
                        }
                        list.add(map);
                    }
                    resultSet.close();

                    return list;
                }
            }
        } catch (SQLException e) {
            System.out.println("获取数据库 ResultSet 对象失败！");
            e.printStackTrace();
        }

        return null;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回查询的列数
     *
     * @param sql
     * @param params
     * @return
     */
    public int getResultSetColumnCount(String sql, Object[] params) {
        if(sql != null && !sql.equals("")) {
            if(params == null) {
                params = new Object[0];
            }
            open();
            if(connection != null) {
                try {
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    for(int i=0; i<params.length; i++) {
                        preparedStatement.setObject(i+1, params[i]);
                    }

                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet != null) {
                        return resultSet.getMetaData().getColumnCount();
                    }
                } catch(SQLException e) {
                    System.out.println("获取数据库 ResultSet 对象失败！");
                    e.printStackTrace();
                }
            }
        }

        return -1;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回查询的列数
     *
     * @param sql
     * @return
     */
    public int getResultSetColumnCount(String sql) {
        if(sql != null && !sql.equals("")) {
            open();
            if(connection != null) {
                try {
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    ResultSet resultSet = preparedStatement.executeQuery();
                    if(resultSet != null) {
                        return resultSet.getMetaData().getColumnCount();
                    }
                } catch(SQLException e) {
                    System.out.println("获取数据库 ResultSet 对象失败！");
                    e.printStackTrace();
                }
            }
        }

        return -1;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行查询操作后返回查询的列数
     *
     * @return
     */
    public int getResultSetColumnCount() {
        try {
            ResultSet resultSet = preparedStatement.getResultSet();

            if(resultSet != null) {
                return resultSet.getMetaData().getColumnCount();
            }
        } catch (SQLException e) {
            System.out.println("获取数据库 ResultSet 对象失败！");
            e.printStackTrace();
        }

        return -1;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行更新操作后返回影响的记录数
     *
     * @param sql
     * @param params
     */
    public int getUpdateCount(String sql, Object[] params) {
        if(sql != null && !sql.equals("")) {
            if(params == null) {
                params = new Object[0];
            }
            open();
            if(connection != null) {
                try {
                    System.out.println(sql);
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    for(int i=0; i<params.length; i++) {
                        preparedStatement.setObject(i+1, params[i]);
                    }
                    preparedStatement.execute();
                    return preparedStatement.getUpdateCount();
                } catch(SQLException e) {
                    System.out.println("执行 doPreparedStatement() 方法出错！");
                    e.printStackTrace();
                }
            }
        }

        return -1;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行更新操作后返回影响的记录数
     *
     * @param sql
     */
    public int getUpdateCount(String sql) {
        if(sql != null && !sql.equals("")) {
            open();
            if(connection != null) {
                try {
                    System.out.println(sql);
                    preparedStatement = connection.prepareStatement(sql, ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_READ_ONLY);
                    preparedStatement.execute();
                    return preparedStatement.getUpdateCount();
                } catch(SQLException e) {
                    System.out.println("执行 doPreparedStatement() 方法出错！");
                    e.printStackTrace();
                }
            }
        }

        return -1;
    }

    /**
     * 功能：获取调用dopreparedStatement()方法执行更新操作后返回影响的记录数
     *
     * @return
     */
    public int getUpdateCount() {
        try {
            return preparedStatement.getUpdateCount();
        } catch (SQLException e) {
            System.out.println("获取数据库 UpdateCount 更新行数失败！");
            e.printStackTrace();
        }
        return -1;
    }

    /**
     * 功能：释放PrepareStatement对象与Connection对象
     */
    public void close() {
        try {
            if(preparedStatement != null) {
                preparedStatement.close();
            }
        } catch(SQLException e) {
            System.out.println("关闭数据库 jdbc.PreparedStatement 对象失败！");
            e.printStackTrace();
        }

        try {
            if(connection != null) {
                connection.close();
            }
        } catch(SQLException e) {
            System.out.println("关闭数据库 jdbc.Connection 对象失败！");
            e.printStackTrace();
        }
    }

    /**
     * 功能：输出请求参数
     *
     * @param response
     * @param data
     */
    public static void writeResponseData(HttpServletResponse response, Object data) {
        response.setContentType("text/html;charset=utf-8");
        try
        {
            PrintWriter out = response.getWriter();
            out.println(data.toString());
            out.flush();
            out.close();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}