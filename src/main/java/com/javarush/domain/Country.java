package com.javarush.domain;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.util.Set;

@Entity
@Table(name = "country", schema = "public")
public class Country {
    @Id
    @Column(columnDefinition = "SMALLINT")
    private Integer id;

    @Column(name = "code", length = 3)
    private String code;

    @Column(name = "code_2", length = 2)
    private String alternativeCode;

    @Column(name = "name", length = 44)
    private String name;

    @Column(name = "continent")
    @Enumerated(EnumType.ORDINAL)
    private Continent continent;

    @Column(name = "region", length = 25)
    private String region;

    @Column(name = "surface_area", nullable = false,precision = 10, scale = 2)
    private BigDecimal surfaceArea;

    @Column(name = "indep_year")
    private Short independeceYear;

    @Column(name = "population")
    private Integer population;

    @Column(name = "life_expectancy", nullable = false,columnDefinition = "NUMERIC(3,1)")
    private BigDecimal lifeExpectancy;

    @Column(name = "gnp", nullable = false,columnDefinition = "NUMERIC(9,2)")
    private BigDecimal GNP;

    @Column(name = "gnpo_id", nullable = false,columnDefinition = "NUMERIC(10,2)")
    private BigDecimal GNPOId;

    @Column(name = "local_name")
    private String localName;

    @Column(name = "government_form")
    private String governmentForm;

    @Column(name = "head_of_state")
    private String headOfState;

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "capital")
    private City city;

    @OneToMany(mappedBy = "country",fetch = FetchType.EAGER)
    private Set<CountryLanguage> languages;

    public Country() {

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getAlternativeCode() {
        return alternativeCode;
    }

    public void setAlternativeCode(String alternativeCode) {
        this.alternativeCode = alternativeCode;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Continent getContinent() {
        return continent;
    }

    public void setContinent(Continent continent) {
        this.continent = continent;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public BigDecimal getSurfaceArea() {
        return surfaceArea;
    }

    public void setSurfaceArea(BigDecimal surfaceArea) {
        this.surfaceArea = surfaceArea;
    }

    public Short getIndependeceYear() {
        return independeceYear;
    }

    public void setIndependeceYear(Short independeceYear) {
        this.independeceYear = independeceYear;
    }

    public Integer getPopulation() {
        return population;
    }

    public void setPopulation(Integer population) {
        this.population = population;
    }

    public BigDecimal getLifeExpectancy() {
        return lifeExpectancy;
    }

    public void setLifeExpectancy(BigDecimal lifeExpectancy) {
        this.lifeExpectancy = lifeExpectancy;
    }

    public BigDecimal getGNP() {
        return GNP;
    }

    public void setGNP(BigDecimal GNP) {
        this.GNP = GNP;
    }

    public BigDecimal getGNPOId() {
        return GNPOId;
    }

    public void setGNPOId(BigDecimal GNPOId) {
        this.GNPOId = GNPOId;
    }

    public String getLocalName() {
        return localName;
    }

    public void setLocalName(String localName) {
        this.localName = localName;
    }

    public String getGovernmentForm() {
        return governmentForm;
    }

    public void setGovernmentForm(String governmentForm) {
        this.governmentForm = governmentForm;
    }

    public String getHeadOfState() {
        return headOfState;
    }

    public void setHeadOfState(String headOfState) {
        this.headOfState = headOfState;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public Set<CountryLanguage> getLanguages() {
        return languages;
    }

    public void setLanguages(Set<CountryLanguage> languages) {
        this.languages = languages;
    }
}
