package com.isea533.mybatis.model;

public class Country {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.Id
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countryname
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    private String countryname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column country.countrycode
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    private String countrycode;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.Id
     *
     * @return the value of country.Id
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.Id
     *
     * @param id the value for country.Id
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countryname
     *
     * @return the value of country.countryname
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    public String getCountryname() {
        return countryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countryname
     *
     * @param countryname the value for country.countryname
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    public void setCountryname(String countryname) {
        this.countryname = countryname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column country.countrycode
     *
     * @return the value of country.countrycode
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    public String getCountrycode() {
        return countrycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column country.countrycode
     *
     * @param countrycode the value for country.countrycode
     *
     * @mbggenerated Wed Aug 26 20:55:40 CST 2015
     */
    public void setCountrycode(String countrycode) {
        this.countrycode = countrycode;
    }
}