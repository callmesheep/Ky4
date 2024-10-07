package Project.ky4.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.awt.*;
import java.io.Serializable;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "providers")
public class Providers  implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long providerId;
    private String companyName;
    private String companyRegistrationNumber;
    private String taxID;
    private String companyAddress;
    private String contactPerson;
    private String contactEmail;
    private String contactPhone;
    private String website;
    private String companyDescription;
    private String logoUrl;
    private String bankAccountNumber;
    private String bankName;
    private String bankBranchName;
    private String licenseDocumentUrl;
    private Boolean status;
    private String RejectionReason;


    @Override
    public String toString() {
        return "Providers{" +
                "providerId=" + providerId +
                ", companyName='" + companyName + '\'' +
                ", companyRegistrationNumber='" + companyRegistrationNumber + '\'' +
                ", taxID='" + taxID + '\'' +
                ", companyAddress='" + companyAddress + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", contactEmail='" + contactEmail + '\'' +
                ", contactPhone='" + contactPhone + '\'' +
                ", website='" + website + '\'' +
                ", companyDescription='" + companyDescription + '\'' +
                ", logoUrl='" + logoUrl + '\'' +
                ", bankAccountNumber='" + bankAccountNumber + '\'' +
                ", bankName='" + bankName + '\'' +
                ", bankBranchName='" + bankBranchName + '\'' +
                ", licenseDocumentUrl='" + licenseDocumentUrl + '\'' +
                ", status=" + status +
                ", RejectionReason='" + RejectionReason + '\'' +
                '}';
    }
}
