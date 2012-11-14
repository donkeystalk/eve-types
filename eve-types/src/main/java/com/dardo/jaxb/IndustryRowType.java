//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2012.11.12 at 10:04:33 AM CST 
//


package com.dardo.jaxb;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for IndustryRowType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="IndustryRowType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="jobID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="assemblyLineID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="containerID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedItemID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedItemLocationID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedItemQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedItemProductivityLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedItemMaterialLevel" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedItemLicensedProductionRunsRemaining" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="outputLocationID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installerID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="runs" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="licensedProductionRuns" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedInSolarSystemID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="containerLocationID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="materialMultiplier" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="charMaterialMultiplier" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="timeMultiplier" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="charTimeMultiplier" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="installedItemTypeID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="outputTypeID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="containerTypeID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedItemCopy" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="completed" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="completedSuccessfully" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installedItemFlag" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="outputFlag" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="activityID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="completedStatus" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="installTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="beginProductionTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="endProductionTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="pauseProductionTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "IndustryRowType")
public class IndustryRowType {

    @XmlAttribute
    protected Integer jobID;
    @XmlAttribute
    protected Integer assemblyLineID;
    @XmlAttribute
    protected Integer containerID;
    @XmlAttribute
    protected Integer installedItemID;
    @XmlAttribute
    protected Integer installedItemLocationID;
    @XmlAttribute
    protected Integer installedItemQuantity;
    @XmlAttribute
    protected Integer installedItemProductivityLevel;
    @XmlAttribute
    protected Integer installedItemMaterialLevel;
    @XmlAttribute
    protected Integer installedItemLicensedProductionRunsRemaining;
    @XmlAttribute
    protected Integer outputLocationID;
    @XmlAttribute
    protected Integer installerID;
    @XmlAttribute
    protected Integer runs;
    @XmlAttribute
    protected Integer licensedProductionRuns;
    @XmlAttribute
    protected Integer installedInSolarSystemID;
    @XmlAttribute
    protected Integer containerLocationID;
    @XmlAttribute
    protected Integer materialMultiplier;
    @XmlAttribute
    protected Float charMaterialMultiplier;
    @XmlAttribute
    protected Float timeMultiplier;
    @XmlAttribute
    protected Float charTimeMultiplier;
    @XmlAttribute
    protected Integer installedItemTypeID;
    @XmlAttribute
    protected Integer outputTypeID;
    @XmlAttribute
    protected Integer containerTypeID;
    @XmlAttribute
    protected Integer installedItemCopy;
    @XmlAttribute
    protected Integer completed;
    @XmlAttribute
    protected Integer completedSuccessfully;
    @XmlAttribute
    protected Integer installedItemFlag;
    @XmlAttribute
    protected Integer outputFlag;
    @XmlAttribute
    protected Integer activityID;
    @XmlAttribute
    protected Integer completedStatus;
    @XmlAttribute
    protected String installTime;
    @XmlAttribute
    protected String beginProductionTime;
    @XmlAttribute
    protected String endProductionTime;
    @XmlAttribute
    protected String pauseProductionTime;

    /**
     * Gets the value of the jobID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getJobID() {
        return jobID;
    }

    /**
     * Sets the value of the jobID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setJobID(Integer value) {
        this.jobID = value;
    }

    /**
     * Gets the value of the assemblyLineID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAssemblyLineID() {
        return assemblyLineID;
    }

    /**
     * Sets the value of the assemblyLineID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAssemblyLineID(Integer value) {
        this.assemblyLineID = value;
    }

    /**
     * Gets the value of the containerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContainerID() {
        return containerID;
    }

    /**
     * Sets the value of the containerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContainerID(Integer value) {
        this.containerID = value;
    }

    /**
     * Gets the value of the installedItemID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemID() {
        return installedItemID;
    }

    /**
     * Sets the value of the installedItemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemID(Integer value) {
        this.installedItemID = value;
    }

    /**
     * Gets the value of the installedItemLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemLocationID() {
        return installedItemLocationID;
    }

    /**
     * Sets the value of the installedItemLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemLocationID(Integer value) {
        this.installedItemLocationID = value;
    }

    /**
     * Gets the value of the installedItemQuantity property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemQuantity() {
        return installedItemQuantity;
    }

    /**
     * Sets the value of the installedItemQuantity property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemQuantity(Integer value) {
        this.installedItemQuantity = value;
    }

    /**
     * Gets the value of the installedItemProductivityLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemProductivityLevel() {
        return installedItemProductivityLevel;
    }

    /**
     * Sets the value of the installedItemProductivityLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemProductivityLevel(Integer value) {
        this.installedItemProductivityLevel = value;
    }

    /**
     * Gets the value of the installedItemMaterialLevel property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemMaterialLevel() {
        return installedItemMaterialLevel;
    }

    /**
     * Sets the value of the installedItemMaterialLevel property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemMaterialLevel(Integer value) {
        this.installedItemMaterialLevel = value;
    }

    /**
     * Gets the value of the installedItemLicensedProductionRunsRemaining property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemLicensedProductionRunsRemaining() {
        return installedItemLicensedProductionRunsRemaining;
    }

    /**
     * Sets the value of the installedItemLicensedProductionRunsRemaining property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemLicensedProductionRunsRemaining(Integer value) {
        this.installedItemLicensedProductionRunsRemaining = value;
    }

    /**
     * Gets the value of the outputLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutputLocationID() {
        return outputLocationID;
    }

    /**
     * Sets the value of the outputLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutputLocationID(Integer value) {
        this.outputLocationID = value;
    }

    /**
     * Gets the value of the installerID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstallerID() {
        return installerID;
    }

    /**
     * Sets the value of the installerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstallerID(Integer value) {
        this.installerID = value;
    }

    /**
     * Gets the value of the runs property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getRuns() {
        return runs;
    }

    /**
     * Sets the value of the runs property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setRuns(Integer value) {
        this.runs = value;
    }

    /**
     * Gets the value of the licensedProductionRuns property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLicensedProductionRuns() {
        return licensedProductionRuns;
    }

    /**
     * Sets the value of the licensedProductionRuns property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLicensedProductionRuns(Integer value) {
        this.licensedProductionRuns = value;
    }

    /**
     * Gets the value of the installedInSolarSystemID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledInSolarSystemID() {
        return installedInSolarSystemID;
    }

    /**
     * Sets the value of the installedInSolarSystemID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledInSolarSystemID(Integer value) {
        this.installedInSolarSystemID = value;
    }

    /**
     * Gets the value of the containerLocationID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContainerLocationID() {
        return containerLocationID;
    }

    /**
     * Sets the value of the containerLocationID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContainerLocationID(Integer value) {
        this.containerLocationID = value;
    }

    /**
     * Gets the value of the materialMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaterialMultiplier() {
        return materialMultiplier;
    }

    /**
     * Sets the value of the materialMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaterialMultiplier(Integer value) {
        this.materialMultiplier = value;
    }

    /**
     * Gets the value of the charMaterialMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCharMaterialMultiplier() {
        return charMaterialMultiplier;
    }

    /**
     * Sets the value of the charMaterialMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCharMaterialMultiplier(Float value) {
        this.charMaterialMultiplier = value;
    }

    /**
     * Gets the value of the timeMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getTimeMultiplier() {
        return timeMultiplier;
    }

    /**
     * Sets the value of the timeMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setTimeMultiplier(Float value) {
        this.timeMultiplier = value;
    }

    /**
     * Gets the value of the charTimeMultiplier property.
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCharTimeMultiplier() {
        return charTimeMultiplier;
    }

    /**
     * Sets the value of the charTimeMultiplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCharTimeMultiplier(Float value) {
        this.charTimeMultiplier = value;
    }

    /**
     * Gets the value of the installedItemTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemTypeID() {
        return installedItemTypeID;
    }

    /**
     * Sets the value of the installedItemTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemTypeID(Integer value) {
        this.installedItemTypeID = value;
    }

    /**
     * Gets the value of the outputTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutputTypeID() {
        return outputTypeID;
    }

    /**
     * Sets the value of the outputTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutputTypeID(Integer value) {
        this.outputTypeID = value;
    }

    /**
     * Gets the value of the containerTypeID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getContainerTypeID() {
        return containerTypeID;
    }

    /**
     * Sets the value of the containerTypeID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setContainerTypeID(Integer value) {
        this.containerTypeID = value;
    }

    /**
     * Gets the value of the installedItemCopy property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemCopy() {
        return installedItemCopy;
    }

    /**
     * Sets the value of the installedItemCopy property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemCopy(Integer value) {
        this.installedItemCopy = value;
    }

    /**
     * Gets the value of the completed property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompleted() {
        return completed;
    }

    /**
     * Sets the value of the completed property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompleted(Integer value) {
        this.completed = value;
    }

    /**
     * Gets the value of the completedSuccessfully property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompletedSuccessfully() {
        return completedSuccessfully;
    }

    /**
     * Sets the value of the completedSuccessfully property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompletedSuccessfully(Integer value) {
        this.completedSuccessfully = value;
    }

    /**
     * Gets the value of the installedItemFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInstalledItemFlag() {
        return installedItemFlag;
    }

    /**
     * Sets the value of the installedItemFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInstalledItemFlag(Integer value) {
        this.installedItemFlag = value;
    }

    /**
     * Gets the value of the outputFlag property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOutputFlag() {
        return outputFlag;
    }

    /**
     * Sets the value of the outputFlag property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOutputFlag(Integer value) {
        this.outputFlag = value;
    }

    /**
     * Gets the value of the activityID property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getActivityID() {
        return activityID;
    }

    /**
     * Sets the value of the activityID property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setActivityID(Integer value) {
        this.activityID = value;
    }

    /**
     * Gets the value of the completedStatus property.
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getCompletedStatus() {
        return completedStatus;
    }

    /**
     * Sets the value of the completedStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setCompletedStatus(Integer value) {
        this.completedStatus = value;
    }

    /**
     * Gets the value of the installTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInstallTime() {
        return installTime;
    }

    /**
     * Sets the value of the installTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInstallTime(String value) {
        this.installTime = value;
    }

    /**
     * Gets the value of the beginProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeginProductionTime() {
        return beginProductionTime;
    }

    /**
     * Sets the value of the beginProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeginProductionTime(String value) {
        this.beginProductionTime = value;
    }

    /**
     * Gets the value of the endProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEndProductionTime() {
        return endProductionTime;
    }

    /**
     * Sets the value of the endProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEndProductionTime(String value) {
        this.endProductionTime = value;
    }

    /**
     * Gets the value of the pauseProductionTime property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPauseProductionTime() {
        return pauseProductionTime;
    }

    /**
     * Sets the value of the pauseProductionTime property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPauseProductionTime(String value) {
        this.pauseProductionTime = value;
    }

}