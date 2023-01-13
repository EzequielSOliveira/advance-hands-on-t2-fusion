export interface Institution {
    id: number;
    corporate_name: string;
    fantasy_name: string;
    cnpj: string;
    desc_economic_activity: string;
    opening_date: Date;
    postalCode: string;
    country: string;
    state: string;
    city: string;
    district: string;
    location: string;
    number: string;
    active: Boolean;
}