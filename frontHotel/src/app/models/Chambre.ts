import { Hotel } from "./Hotel";

export class Chambre {
    constructor(public id: number, public label: string, public dispo: boolean, public hotel: Hotel) {
    }
}