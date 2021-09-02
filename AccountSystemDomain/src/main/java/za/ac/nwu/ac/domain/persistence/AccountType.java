package za.ac.nwu.ac.domain.persistence;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.Objects;
import java.util.Set;

@Entity
@Table(name = "DEOM_ACCOUNT_TYPE", schema = "VITRSA_SANDBOX")
public class AccountType implements Serializable {

    private static final long serialVersionUID = -2282337104058330818L;

    private Long accountTypeId;
    private String mnemonic;
    private String accountTypeName;
    private LocalDate creationDate;

    private Set<AccountTransaction> accountTransactions;

    public AccountType(){
    }

    public AccountType(Long accountTypeId, String mnemonic, String accountTypeName, LocalDate creationDate){
        this.accountTypeId = accountTypeId;
        this.mnemonic = mnemonic;
        this.accountTypeName = accountTypeName;
        this.creationDate = creationDate;
    }

    @Id
    @SequenceGenerator(name = "VIT_RSA_GENERIC_SEQ", sequenceName = "VITRSA_SANDBOX.VIT_RSA_GENERIC_SEQ", allocationSize = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "VIT_RSA_GENERIC_SEQ")

    @Column(name = "ACCOUNT_TYPE_ID")
    public Long getAccountTypeId(){
        return accountTypeId;
    }

    @Column(name = "MNEMONIC")
        public String getMnemonic() {
        return mnemonic;
    }

    @Column(name = "ACCOUNT_TYPE_NAME")
        public String getAccountTypeName(){
            return  accountTypeName;
    }

    @Column(name = "CREATION_DATE")
    public LocalDate getCreationDate(){
        return creationDate;
    }

}
