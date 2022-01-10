package com.webauthn.app.data.repository;

import java.util.List;
import java.util.Optional;

import com.webauthn.app.data.objects.Credential;
import com.webauthn.app.data.objects.User;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthenticatorRepository extends CrudRepository<Credential, Long> {
    Optional<Credential> findByCredentialId(byte[] credentialId);
    List<Credential> findAllByUser (User user);
    List<Credential> findAllByCredentialId(byte[] credentialId);
}
