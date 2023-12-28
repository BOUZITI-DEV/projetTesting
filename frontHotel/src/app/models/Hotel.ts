import { Ville } from "./Ville";

export class Hotel {
    constructor(public id: number, public nom: string, public adresse: string, public ville: Ville) {
    }
}