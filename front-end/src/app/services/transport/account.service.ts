import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Globals } from 'app/shared/Globals';
import { Account } from 'app/shared/models/Account';
import { Client } from 'app/shared/models/Client';

const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json',
  })
};

@Injectable({
  providedIn: 'root'
})

export class AccountService {

  API = this.globals.API;
  constructor(private http: HttpClient, private globals: Globals) { }

  getAll() {
    return this.http.get<Account[]>(this.API + '/accounts');
  }

  getById(id: number) {
    return this.http.get<Account[]>(this.API + '/accounts/id/' + id);
  }

  getByIban(iban: string) {
    return this.http.get<Account>(this.API + '/accounts/iban/' + iban);
  }

  getAccountByClientId(clientId: number) {
    return this.http.get<Account[]>(this.API + '/client/accounts/' + clientId);
  }

  getAccountClients(accountId: number) {
    return this.http.get<Client[]>(this.API + '/account/clients/' + accountId);
  }

  addAccount(account: string) {
    return this.http.post(this.API + '/accounts/add', account, httpOptions);
  }

  updateAccount(account: Account) {
    return this.http.put(this.API + '/accounts/update', account, httpOptions);
  }

  addClientToAccount(clientId: number, accountId: number) {
    const body = JSON.parse(JSON.stringify({
      clientId: clientId,
      accountId: accountId
    }));
    console.log(body);

    return this.http.post(this.API + '/addClient', body, httpOptions);
  }

  deleteClientFromAccount(clientId: number, accountId: number) {
    const body = JSON.parse(JSON.stringify({
      clientId: clientId,
      accountId: accountId
    }));
    console.log(body);

    return this.http.post(this.API + '/deleteClient', body, httpOptions);
  }
}
